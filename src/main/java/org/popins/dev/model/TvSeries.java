package org.popins.dev.model;

import java.net.URL;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author PNayak
 * reference : https://api.tvmaze.com/singlesearch/shows?q=friends
 */
public class TvSeries {
	
	private Long id;
	private URL url;
	private String name;
	private String type;
	private String language;
	private Set<String> genres;
	private String summary;
	private List<Episode> episodes;
	
	public Long getId() {
		return id;
	}
	public URL getUrl() {
		return url;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getLanguage() {
		return language;
	}
	public Set<String> getGenres() {
		return genres;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setGenres(Set<String> genres) {
		this.genres = genres;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
}
