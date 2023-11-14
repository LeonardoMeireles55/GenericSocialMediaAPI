CREATE TABLE connections (
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_user BIGINT NOT NULL,
    id_friend BIGINT NOT NULL,
    connection_time VARCHAR(25),
    PRIMARY KEY (id),
    INDEX (id_user), INDEX (id_friend),
    FOREIGN KEY (id_user) REFERENCES users(id),
    FOREIGN KEY (id_friend) REFERENCES users(id)
)