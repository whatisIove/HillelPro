package ua.ithillel.homework31.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NamedNativeQuery(name = "getAllJobs", query = "SELECT * FROM jobs;", resultClass = Job.class)
public class Job {

    public Job(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Integer jobId;
    private String name;
    private String schedule;

    @OneToOne(mappedBy = "job")
    private Client client;
}
