package org.popins.dev.proxy;

import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.popins.dev.model.Episode;

@RegisterRestClient
@Path("/shows")
@Produces(MediaType.APPLICATION_JSON)
public interface EpisodesProxy {
	
	@GET
	@Path("{id}/episodes")
	public List<Episode> getEpisodes(@PathParam("id") Long id);

}
