package hu.gde.runnersdemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RunnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long runnerId;
    private String runnerName;
    private long averagePace;

    //1. feladat magasság hozzáadása
    private int height;

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SponsorEntity> sponsors = new ArrayList<>();

    @OneToMany(mappedBy = "runner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LapTimeEntity> laptimes = new ArrayList<>();


    public RunnerEntity() {
    }

    public long getRunnerId() {
        return runnerId;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public long getAveragePace() {
        return averagePace;
    }

    public void setRunnerId(long runnerId) {
        this.runnerId = runnerId;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public void setAveragePace(long averagePace) {
        this.averagePace = averagePace;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<SponsorEntity> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<SponsorEntity> sponsors) {
        this.sponsors = sponsors;
    }

    public List<LapTimeEntity> getLaptimes() {
        return laptimes;
    }
}
