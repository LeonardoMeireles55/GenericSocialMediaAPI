CREATE TABLE comments (
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_user BIGINT NOT NULL,
    id_post BIGINT NOT NULL,
    comment_text VARCHAR(50),
    comment_time VARCHAR(25),
    PRIMARY KEY(id),
    INDEX(id_user),
    INDEX(id_post),
    FOREIGN KEY (id_user) REFERENCES users(id),
    FOREIGN KEY (id_post) REFERENCES posts(id)
)