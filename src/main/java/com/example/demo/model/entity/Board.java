package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "board")
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String topic;

    @Lob
    private String contents;

    private LocalDateTime createTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // 關聯
    @OneToMany(mappedBy = "board")
    private List<BoardPicture> boardPictures;

    @OneToMany(mappedBy = "board")
    private List<Chat> chats;

    @OneToMany(mappedBy = "board")
    private List<BoardChat> boardChats;

    // Getter & Setter
}
