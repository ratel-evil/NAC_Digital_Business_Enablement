package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.VendaBO;
import br.com.fiap.to.VendaTO;

@Path("/venda")
public class VendaResource {
	
	VendaBO bo = new VendaBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public List<VendaTO> buscar(){
		return	bo.listar(); 
	}
			
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public VendaTO buscar(@PathParam("id") int cod) {
		return bo.listar(cod);
	}
	
	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id") int cod) {
		bo.delete(cod);
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(VendaTO venda,@PathParam("id")int cod) {
		
//		venda.setCodigo(cod);
		bo.update(venda);
		return Response.ok().build();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(VendaTO venda, @Context UriInfo urinfo) {
		bo.insert(venda);
		UriBuilder builder = urinfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(venda.getCodigo()));
		return Response.created(builder.build()).build();
	}
	
	
}
