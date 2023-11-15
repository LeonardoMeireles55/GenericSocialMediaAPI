CREATE TRIGGER increment_like_count
    AFTER INSERT ON likes
    FOR EACH ROW
BEGIN
    UPDATE posts
    SET likes_count = likes_count + 1
    WHERE id = NEW.id_post;
END;
