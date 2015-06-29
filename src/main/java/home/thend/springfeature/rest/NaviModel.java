package home.thend.springfeature.rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NaviModel {
	
	private int count;
	
	private List<AppModel> apps;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<AppModel> getApps() {
		return apps;
	}

	public void setApps(List<AppModel> apps) {
		this.apps = apps;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NaviModel : ").append(count).append(" ");
		for(AppModel appModel : apps) {
			sb.append(appModel.toString()).append(" ");
		}
		return sb.toString();
	}

}
