package br.com.glosma.associacao.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.glosma.associacao.core.Comparador;
import br.com.glosma.associacao.core.ResultadoComparacaoProcedimento;
import br.com.glosma.associacao.core.interfaces.convenio.IFaturaConvenio;
import br.com.glosma.associacao.core.interfaces.hospital.IFaturaHospital;
import br.com.glosma.associacao.faturas.commons.enums.IOpcoesEnum;
import br.com.glosma.associacao.faturas.convenio.ConvenioEnum;
import br.com.glosma.associacao.faturas.convenio.FaturaCovenioFactory;
import br.com.glosma.associacao.faturas.hospital.FaturaHospitalFactory;
import br.com.glosma.associacao.faturas.hospital.HospitalEnum;

@Path(value = "/teste")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class AssociacaoResource {

	@POST
	@Path(value = "/")
	public Response obterAssociacao(final AssociacaoVO associacaoVO) {

		IFaturaHospital faturaHospital = (IFaturaHospital) FaturaHospitalFactory.getInstance().obterFatura(
				IOpcoesEnum.obterOpcaoPorCodigo(HospitalEnum.values(), associacaoVO.getCodigoHospital()),
				associacaoVO.getUrlArquivoHospital());
		IFaturaConvenio faturaConvenio = (IFaturaConvenio) FaturaCovenioFactory.getInstance()
				.obterFatura(IOpcoesEnum.obterOpcaoPorCodigo(ConvenioEnum.values(),
						associacaoVO.getCodigoConvenio()), associacaoVO.getUrlConvenioSitePrincipal());
		List<ResultadoComparacaoProcedimento> resultadoComparacoesPorProcedimento = Comparador.realizarComparacao(
				faturaHospital.getProcedimentosExecutados(), faturaConvenio.getProcedimentosExecutados());
		return Response.ok(new ResultadoAssociacao(resultadoComparacoesPorProcedimento)).build();

	}

}
