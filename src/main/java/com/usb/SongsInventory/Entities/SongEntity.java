package com.usb.SongsInventory.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Table(name = "songs_entity")
@AllArgsConstructor
@NoArgsConstructor
public class SongEntity {

    @Id
    @Column(name = "id", nullable = false, length = 36)
    @JsonProperty("id")
    private String id;

    @Setter
    @Column(name = "name", nullable = false, length = 255)
    @JsonProperty("name")
    @NotBlank(message = "Song name is required")
    @Size(min = 3, max = 100, message = "Song Name must be between 3 and 100 characters")
    private String name;

    @Setter
    @Column(name = "artist", nullable = false, length = 255)
    @JsonProperty("artist")
    @NotBlank(message = "Artist name is required")
    @Size(min = 3, max = 100, message = "Artist Name must be between 3 and 100 characters")
    private String artist;

    @Setter
    @Column(name = "album", nullable = false, length = 255)
    @JsonProperty("album")
    @NotBlank(message = "Album name is required")
    @Size(min = 3, max = 100, message = "Album Name must be between 3 and 100 characters")
    private String album;

    @Setter
    @Column(name = "year", nullable = false, length = 4)
    @JsonProperty("year")
    @NotBlank(message = "Year is required")
    @Pattern(regexp = "^(15|20)\\d{2}$", message = "Year must be a valid 4-digit number (1500-2099)")
    private String year;

    @Override
    public String toString() {
        return "PcGamesEntity{" +
                "id='" + id + '\'' +
                ", gameName='" + name + '\'' +
                ", gameYear='" + artist + '\'' +
                ", gameScore=" + album +
                ", gamePublisher='" + year + '\'' +
                '}';
    }
}
