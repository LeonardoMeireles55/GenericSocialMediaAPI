CREATE TRIGGER prevent_duplicate_likes
    BEFORE INSERT ON likes
    FOR EACH ROW
BEGIN
    IF EXISTS (
        SELECT 1
        FROM likes
        WHERE id_post = NEW.id_post AND id_user = NEW.id_user
    ) THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Não é permitido dar mais de um like no mesmo post.';
    END IF;
END;