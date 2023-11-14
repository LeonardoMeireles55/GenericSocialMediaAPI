CREATE TABLE likes (
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_post BIGINT NOT NULL,
    id_user BIGINT NOT NULL,
    like_time VARCHAR(25),
    PRIMARY KEY (id),
    INDEX (id_post),
    INDEX (id_user),
    FOREIGN KEY (id_post) REFERENCES posts(id),
    FOREIGN KEY (id_user) REFERENCES users(id)
)