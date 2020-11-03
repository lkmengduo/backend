package com.TTEnglish.backend.controller;

import com.TTEnglish.backend.constant.VisitFlag;
import com.TTEnglish.backend.model.Content;
import com.TTEnglish.backend.model.ReqDto;
import com.TTEnglish.backend.service.AllService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class ContentController {
    public ReqDto reqDto = new ReqDto();
    private AllService service = new AllService();
    private VisitFlag visitFlag = new VisitFlag();

    @GetMapping("/get_pattern_flag")
    public String get_pattern_flag(String result) throws IOException {
        System.out.println("这是第三条数据");
        System.out.println("临时变量的值是:"+reqDto.getTempvalue());
        return result;
    }

    @GetMapping("/get_content")
    public List<Content> SelectCommentContent(HttpSession session) throws IOException {
        reqDto.setContent_flag(visitFlag.all_content);
        reqDto.setSession(session);
        System.out.println("session中保存的topicid是:");
        System.out.println(reqDto.getSession().getAttribute("topic_id"));
        return service.SelectCommentContent(reqDto);
    }

    @GetMapping("/get_profile")
    public List<Content> get_profile(HttpSession session) throws IOException {
        reqDto.setContent_flag(visitFlag.profile_content);
        reqDto.setSession(session);
        return service.SelectCommentContent(reqDto);
    }
}