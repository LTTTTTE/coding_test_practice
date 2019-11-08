package codeTestSet.kakao.test2017_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public String[] solution(String[] files) {
        return Arrays.stream(files).map(x->{
            List<String> stringList = new ArrayList<>();
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) >= '0'&& x.charAt(i) <='9'){
                    stringList.add(x.substring(0,i));
                    x = x.substring(i);
                    break;
                }
            }
            for(int i = 0; i < x.length();i++){
                if(x.charAt(i)< '0' || x.charAt(i) >'9'){
                    stringList.add(x.substring(0,i));
                    stringList.add(x.substring(i));
                    break;
                }
                if(i >= x.length() - 1){
                    stringList.add(x);
                    stringList.add("");
                }
            }
            return stringList;
        }).sorted((a,b)->{
            if(a.get(0).compareToIgnoreCase(b.get(0)) != 0){
                return a.get(0).compareToIgnoreCase(b.get(0));
            } else {
                return Integer.compare(Integer.parseInt(a.get(1)),Integer.parseInt(b.get(1)));
            }
        }).map(x->{
            return x.stream().collect(Collectors.joining());
        }).toArray(String[]::new);
    }
}
