package a84.storebackendrestspring.m.objects;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "quizzId")
public class Quizz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizzId;

    private String name;
    private String description;

    public Quizz() {
    }

    public Quizz(int quizzId, String name, String description) {
        this.quizzId = quizzId;
        this.name = name;
        this.description = description;
    }

    public int getQuizzId() {
        return quizzId;
    }

    public void setQuizzId(int quizzId) {
        this.quizzId = quizzId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Quizz{" +
                "quizzId=" + quizzId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
