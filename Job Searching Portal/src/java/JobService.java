package com.ashu.JobPortalWebApp.service;

import com.ashu.JobPortalWebApp.model.JobPost;
import com.ashu.JobPortalWebApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {



    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
//        repo.addJob(jobPost); //here jobPost is a DTO i.e Data Transfer obj
          repo.save(jobPost);
    }

   public List<JobPost> getAllJobs(){
          return repo.findAll();
    }




    public JobPost getJob(int postId) {
//        return repo.getJob(postId);
//        int i=10/0;
        return repo.findById(postId).orElse(new JobPost(0,null,null,0,null));
    }

    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
          repo.save(jobPost);
    }

    public void deleteJob(int postID) {
//        repo.deleteJob(postID);
            repo.deleteById(postID);
    }

    public void load() {
        List<JobPost> jobs=new ArrayList<>(List.of(
                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                        List.of("Core Java", "J2EE", "Spring Boot")),
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")),
                new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                        List.of("Python", "Machine Learning", "Data Analysis"))
        ));

        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
