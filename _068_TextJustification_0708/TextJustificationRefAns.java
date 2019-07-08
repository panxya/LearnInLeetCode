package _068_TextJustification_0708;

import java.util.ArrayList;
import java.util.List;


public class TextJustificationRefAns {
	
	public static void main(String[] args) {
		String[] words = {
				"This", "is", "an", "example", "of", "text", "justification."	
		};
		List<String> res =fullJustify(words, 16);
		for(int i = 0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
	}
	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> lines=new ArrayList<>();
		int index = 0;
		while(index<words.length) {
			//一行所有单词的总长度
			int count = words[index].length();
			//该行最后一个词的index
			int last = index +1;
			while(last<words.length) {
				//边界
				if(words[last].length()+count+1>maxWidth) break;
				//加上一个完美匹配
				count +=1+words[last].length();
				last++;
			}
			StringBuilder sb = new StringBuilder();
			//添加第一个单词
			sb.append(words[index]);
			//diff是这行除去第一个已经添加的词之外剩下词语的个数，从index到last-1
			int diff = last-index-1;
			//最后一行的每个单词中间一个空格，剩余是空白
			if(last==words.length||diff==0) {
				for(int i = index+1;i<last;i++) {
					sb.append(" ");
					sb.append(words[i]);
				}
				for(int i =sb.length();i<maxWidth;i++) {
					sb.append(" ");
				}
			}else {
				//不是最后一行
				 //这一行总space的个数：（长度-累计单词总长度）
                //每个单词后面space的个数：（长度-累计单词总长度）/单词个数
                // r为需要平均分配到中间的空格总数
				int spaces = (maxWidth-count)/diff;
				int r =(maxWidth-count)%diff;
				for(int i = index+1;i<last;i++) {
					for(int k = spaces;k>0;k--) {
						sb.append(" ");
					}
					if(r>0) {
						sb.append(" ");
						r--;
					}
					sb.append(" ");
					sb.append(words[i]);
				}
			}
			lines.add(sb.toString());
			index = last ;
		}
		
		
		return lines;
	        
	    }
}
