DROP TABLE IF EXISTS songs_entity;
CREATE TABLE songs_entity (
    id VARCHAR(36) NOT NULL,
    song_name VARCHAR(255) NOT NULL,
    song_artist VARCHAR(255) NOT NULL,
    song_album VARCHAR(255) NOT NULL,
    song_year VARCHAR(4) NOT NULL,
    PRIMARY KEY (id)
);
