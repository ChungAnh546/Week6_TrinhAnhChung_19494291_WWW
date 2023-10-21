package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "first_name",length = 150)
    private String first_name;

    @Column(name = "middle_name",length = 150)
    private String middle_name;

    @Column(name = "last_name",length = 150)
    private String last_name;

    @Column(name = "mobile", length = 15)
    private String mobile;

    @Column(name = "email",length = 100)
    private String email;

    @Column(name = "password_hash",length = 210,nullable = false)
    private String password_hash;

    @Column(name = "registered_at",nullable = false)
    private Instant registered_at;

    @Column(name = "last_login")
    private Instant last_login;

    @Lob
    @Column(name = "intro")
    private String intro;

    @Lob
    @Column(name = "profile")
    private String profile;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<PostComment> commentSets = new LinkedHashSet<>();
}
