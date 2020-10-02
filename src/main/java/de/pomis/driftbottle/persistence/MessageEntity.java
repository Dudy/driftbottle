package de.pomis.driftbottle.persistence;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long sender;
    private Long receiver;
    private String text;

    public MessageEntity() {
    }

    public MessageEntity(final Long sender, final Long receiver, final String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(final Long sender) {
        this.sender = sender;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(final Long receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final MessageEntity that = (MessageEntity) o;
        return Objects.equals(id, that.id) &&
               Objects.equals(sender, that.sender) &&
               Objects.equals(receiver, that.receiver) &&
               Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sender, receiver, text);
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
               "id=" + id +
               ", sender=" + sender +
               ", receiver=" + receiver +
               ", text='" + text + '\'' +
               '}';
    }
}
