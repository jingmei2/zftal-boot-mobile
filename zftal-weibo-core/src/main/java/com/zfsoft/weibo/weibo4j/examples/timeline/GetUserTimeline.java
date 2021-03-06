package com.zfsoft.weibo.weibo4j.examples.timeline;

import com.zfsoft.weibo.weibo4j.Timeline;
import com.zfsoft.weibo.weibo4j.examples.oauth2.Log;
import com.zfsoft.weibo.weibo4j.model.Status;
import com.zfsoft.weibo.weibo4j.model.StatusWapper;
import com.zfsoft.weibo.weibo4j.model.WeiboException;


public class GetUserTimeline {

	public static void main(String[] args) {
		String access_token = "2.00_Vwu1GzHpwXCa1775598cbhtYaFD";

		Timeline tm = new Timeline();
		tm.client.setToken(access_token);
		try {
			StatusWapper status = tm.getUserTimeline();
			for(Status s : status.getStatuses()){
				Log.logInfo(s.toString());
			}
			System.out.println(status.getNextCursor());
			System.out.println(status.getPreviousCursor());
			System.out.println(status.getTotalNumber()/20L+1);
			System.out.println(status.getHasvisible());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
