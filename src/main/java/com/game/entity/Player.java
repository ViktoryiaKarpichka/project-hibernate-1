package com.game.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Date;
import org.hibernate.annotations.GeneratorType;

@NamedQuery(name = "getAllCount", query = "select count(p) from Player p")
@Entity
@Table(name = "player", schema = "rpg")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "player_seq")
    @SequenceGenerator(name = "player_seq", sequenceName = "player_seq", initialValue = 41, allocationSize=1)

    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", length = 12, nullable = false)
    private String name;
    @Column(name = "title", length = 30, nullable = false)
    private String title;
    @Enumerated(EnumType.ORDINAL)
    private Race race;
    @Enumerated(EnumType.ORDINAL)
    private Profession profession;
    @Column(name = "birthday", nullable = false)
    private Date birthday;
    @Column(name = "banned", nullable = false)
    private Boolean banned;
    @Column(name = "level", nullable = false)
    private Integer level;

    public Player() {
    }

    public Player(Long id, String name, String title, Race race, Profession profession, Date birthday, Boolean banned, Integer level) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.birthday = birthday;
        this.banned = banned;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}