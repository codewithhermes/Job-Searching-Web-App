package com.ashu.JobPortalWebApp.repo;

import com.ashu.JobPortalWebApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

     List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);


}

//List<JobPost> jobs=new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                    List.of("Core Java", "J2EE", "Spring Boot")),
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                    3, List.of("HTML", "CSS", "JavaScript", "React")),
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                    List.of("Python", "Machine Learning", "Data Analysis"))
//            ));
//
//
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getJob(int postID) {
//
//        for (JobPost job : jobs){
//            if(job.getPostId()==postID)
//                return job;
//        }
//
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for (JobPost jobPost1 : jobs){
//            if (jobPost1.getPostId()==jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost.getPostDesc());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//    }
//
//    public void deleteJob(int postID) {
//        for (JobPost jobPost:jobs){
//            if (jobPost.getPostId()==postID){
//                jobs.remove(jobPost);
//            }
//        }
//    }
