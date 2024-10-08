package hello.hello_spring.domain;

import jakarta.persistence.*;

@Entity
public class Member {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 순차적으로 자동생성
    private Long id;

    private String name;

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
}
