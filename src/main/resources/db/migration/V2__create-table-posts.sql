CREATE TABLE posts
(
    PRIMARY KEY (id),
    id        BIGINT NOT NULL AUTO_INCREMENT,
    id_user   BIGINT NOT NULL,
    text_post VARCHAR(100),
    time_post VARCHAR(25),
    likes_count int DEFAULT 0,
    INDEX (id_user),
    FOREIGN KEY (id_user) REFERENCES users(id)
);