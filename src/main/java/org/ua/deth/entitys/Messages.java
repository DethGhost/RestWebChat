package org.ua.deth.entitys;

import org.hibernate.annotations.Type;
import org.hibernate.type.TextType;

import javax.persistence.*;

@Entity
public class Messages {
    @Id
    @SequenceGenerator(name = "messages_seq", sequenceName = "messages_seq")
    @GeneratedValue(generator = "messages_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "messages_id")
    private long messagesId;

    @Column
    @Type(type = "text")
    private String body;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sender_id", nullable = false)
    private ChatUser senderUser;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "receiver_id", nullable = false)
    private ChatUser receiverUser;

    public long getMessagesId() {
        return messagesId;
    }

    public void setMessagesId(long messagesId) {
        this.messagesId = messagesId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ChatUser getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(ChatUser senderUser) {
        this.senderUser = senderUser;
    }

    public ChatUser getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(ChatUser receiverUser) {
        this.receiverUser = receiverUser;
    }
}
