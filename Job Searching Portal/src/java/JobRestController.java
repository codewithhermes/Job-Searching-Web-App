package com.ashu.JobPortalWebApp;

import com.ashu.JobPortalWebApp.model.JobPost;
import com.ashu.JobPortalWebApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //whatever you return will be treated as abody unlike controller who treats everything like viewpages
//@CrossOrigin(origins = "http://localhost:3000") this annotation will allow us to connect our spring with react
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path="jobPosts",produces = {"application/json"}) //here this particular method will only return json data
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postID}")
    public JobPost getJob(@PathVariable("postID") int postID){
        return service.getJob(postID);
    }

    //@PostMapping(path="jobPost",consumes = {"application/xml"}) //this method will only get xml format data
   @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){

        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
     @DeleteMapping("jobPost/{postID}")
    public String deleteJob(@PathVariable int postID){
        service.deleteJob(postID);
        return "Deleted";
    }
     @DeleteMapping("jobPost/{postID}")
    public String deleteJob(@PathVariable int postID){
        service.deleteJob(postID);
        return "Deleted";
    }




    

   

    @GetMapping("/load")
    public String loadData(){
        service.load();
        return "success";
    }
    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

   

}
