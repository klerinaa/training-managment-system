package com.sda.trainingmanagmentsystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationReadId;
    private Boolean isRead;

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private User user;
    @ManyToOne
    @JoinColumn(name = "notificationId")
    private Notification notification;

}
