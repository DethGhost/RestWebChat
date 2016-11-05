package org.ua.deth.entitys;

import javax.persistence.*;

@Entity(name = "black_list")
public class BlackList {
    @Id
    @SequenceGenerator(name = "black_list_seq", sequenceName = "black_list_seq")
    @GeneratedValue(generator = "black_list_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "black_list_id")
    private long blackListId;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "banned_use_id")
    private ChatUser bannedUser;

    public long getBlackListId() {
        return blackListId;
    }

    public void setBlackListId(long blackListId) {
        this.blackListId = blackListId;
    }

    public ChatUser getBannedUser() {
        return bannedUser;
    }

    public void setBannedUser(ChatUser bannedUser) {
        this.bannedUser = bannedUser;
    }
}
