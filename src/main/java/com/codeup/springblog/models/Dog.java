// ================================= JPA TABLE CREATION PRACTICE (MINI EXERCISE) 11/03/21
//
//Create a model class (Dog) with proper annotations to make a dogs table with the following properties:
//
//  1) id
//  2) age
//  3) name
//  4) resideState
//
//Be sure to include getters and setters and constructors and needed annotations.
//
//When running the 'SHOW CREATE TABLE dogs', you should have the following schema:
//
//  CREATE TABLE `dogs` (
//    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//    `age` tinyint(3) unsigned NOT NULL,
//    `name` varchar(200) NOT NULL,
//    `reside_state` char(2) DEFAULT 'XX',
//    PRIMARY KEY (`id`),
//    UNIQUE KEY `UK_?????????????????` (`age`)
//  ) ENGINE=<WHATEVER_VALUE_HERE> DEFAULT CHARSET=utf8
//
//Once you have the correct schema, use the following seed data to populate the table with default values:
//
//USE put_the_name_of_your_DB_here;
//
//INSERT INTO dogs (age, name, reside_state)
//VALUES
//  (2, 'Chuck', 'TX'),
//  (5, 'Fred', 'OH'),
//  (3, 'Bud', 'TN'),
//  (10, 'Bailey', 'AL'),
//  (11, 'Lexie', 'TX'),
//  (1, 'Snickers', 'TX'),
//  (6, 'Red', 'FL'),
//  (8, 'Barney', 'CA'),
//  (12, 'Bowser', 'TX');

package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "tinyint(3) unsigned not null")
    private int age;
    @Column(columnDefinition = "varchar(200) not null")
    private String name;
    @Column(columnDefinition = "char(2) DEFAULT 'XX'")
    private String resideState;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}
