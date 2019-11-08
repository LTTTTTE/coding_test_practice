package codeTestSet.kakao.test2017_3;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Problem3Test {
    @Test
    public void test(){
        Problem3 problem3 = new Problem3();

        String[] case1 = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] answer1 = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};
        String[] case2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] answer2 = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};

        assertThat(problem3.solution(case1)).isEqualTo(answer1);
        assertThat(problem3.solution(case2)).isEqualTo(answer2);
    }
}