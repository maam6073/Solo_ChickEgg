package SoloProject.ChickEgg.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    int id;
    @Column(nullable = false)
    String nickname;
    @Column
    String email;
    @Column
    String password;
    @Column
    int age;
    @Column
    char gender;
}
