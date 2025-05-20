
CREATE TABLE IF NOT EXISTS songs_entity (
    id CHAR(36) NOT NULL,
    song_name VARCHAR(255) NOT NULL,
    song_artist VARCHAR(255) NOT NULL,
    song_album VARCHAR(255) NOT NULL,
    song_year VARCHAR(4) NOT NULL,
    PRIMARY KEY (id)
);
