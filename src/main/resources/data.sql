INSERT INTO songs_entity (id, song_name, song_artist, song_album, song_year)
VALUES
    (UNHEX(REPLACE(UUID(), '-', '')), 'Bohemian Rhapsody', 'Queen', 'A Night at the Opera', '1975'),
    (UNHEX(REPLACE(UUID(), '-', '')), 'Imagine', 'John Lennon', 'Imagine', '1971'),
    (UNHEX(REPLACE(UUID(), '-', '')), 'Billie Jean', 'Michael Jackson', 'Thriller', '1982'),
    (UNHEX(REPLACE(UUID(), '-', '')), 'Smells Like Teen Spirit', 'Nirvana', 'Nevermind', '1991'),
    (UNHEX(REPLACE(UUID(), '-', '')), 'Rolling in the Deep', 'Adele', '21', '2011')
    ON DUPLICATE KEY UPDATE
                         song_album = VALUES(song_album),
                         song_year = VALUES(song_year);