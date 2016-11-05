package org.ua.deth.entitys;

import javax.persistence.*;

@Entity(name = "chat_users")
public class ChatUser {
    @Id
    @SequenceGenerator(name = "chat_user_seq", sequenceName = "chat_user_seq")
    @GeneratedValue(generator = "chat_user_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "chat_user_id")
    private long chatUserId;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "login", length = 30, unique = true)
    private String login;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    @Column(name = "password", length = 30)
    private String password;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getChatUserId() {
        return chatUserId;
    }

    public void setChatUserId(long chatUserId) {
        this.chatUserId = chatUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
