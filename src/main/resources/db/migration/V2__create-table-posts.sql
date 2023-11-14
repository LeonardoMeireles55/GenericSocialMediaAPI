CREATE TABLE posts
(
    PRIMARY KEY (id),
    id        BIGINT NOT NULL AUTO_INCREMENT,
    user_id   BIGINT NOT NULL,
    text_post VARCHAR(100),
    time_post VARCHAR(25),
    INDEX (user_id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);