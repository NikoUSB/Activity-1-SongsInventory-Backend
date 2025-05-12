CREATE TABLE IF NOT EXISTS songs_entity (
                                            id BINARY(16) NOT NULL,
    song_name VARCHAR(255) NOT NULL,
    song_artist VARCHAR(255) NOT NULL,
    song_album VARCHAR(255) NOT NULL,
    song_year VARCHAR(4) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (song_name, song_artist)
    );
