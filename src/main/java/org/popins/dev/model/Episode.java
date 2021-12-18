package org.popins.dev.model;

import java.net.URL;

public class Episode {

	private Long id;
	private URL url;
	private Long number;
	private String name;
	private String summary;
	private Long season;
	private String runtime;
	
	public Long getId() {
		return id;
	}
	public URL getUrl() {
		return url;
	}
	public Long getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public String getSummary() {
		return summary;
	}
	public Long getSeason() {
		return season;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setSeason(Long season) {
		this.season = season;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	
}
