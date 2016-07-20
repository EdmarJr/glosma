package br.com.glosma.associacao.faturas.hospital.santahelena;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import br.com.glosma.associacao.core.interfaces.hospital.IFaturaHospital;
import br.com.glosma.associacao.core.interfaces.hospital.IProcedimentoExecutadoHospital;
import br.com.glosma.associacao.faturas.hospital.santahelena.ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao;
import br.com.glosma.associacao.faturas.hospital.santahelena.ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado;

public class ContainerDadosSantaHelenaXMLAdapter implements IFaturaHospital{
	private ContainerDadosSantaHelenaXML containerDados;

	public ContainerDadosSantaHelenaXMLAdapter(
			ContainerDadosSantaHelenaXML containerDados) {
				this.containerDados = containerDados;
	}
	
	public List<IProcedimentoExecutadoHospital> getProcedimentosExecutados() {

		List<GuiaResumoInternacao> guiasResumoInternacao = containerDados.getPrestadorParaOperadora().getLoteGuias()
				.getGuiasTISS().getGuiaResumoInternacao();

		ArrayList<IProcedimentoExecutadoHospital> listaProcedimentos = new ArrayList<IProcedimentoExecutadoHospital>();

		for (GuiaResumoInternacao guiaResumoInternacao : guiasResumoInternacao) {
			List<ProcedimentoExecutado> procedimentos = guiaResumoInternacao.getProcedimentosExecutados()
					.getProcedimentoExecutado();
			for (final ProcedimentoExecutado procedimentoExecutado : procedimentos) {

				listaProcedimentos.add(construirProcedimentoExecutado(procedimentoExecutado));
			}
		}
		return listaProcedimentos;
	}

	private IProcedimentoExecutadoHospital construirProcedimentoExecutado(
			final ProcedimentoExecutado procedimentoExecutado) {
		return new IProcedimentoExecutadoHospital() {
			ProcedimentoExecutado procedimentoExecutadoTemp = procedimentoExecutado;

			public String getValorUnitario() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "valorUnitario");
				return obterValorDoJAXBElement(value);
			}

			public String getValorTotal() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "valorTotal");
				return obterValorDoJAXBElement(value);

			}

			public String getReducaoAcrescimo() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(),
						"reducaoAcrescimo");
				return obterValorDoJAXBElement(value);
			}

			public String getQuantidadeExecutada() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(),
						"quantidadeExecutada");
				return obterValorDoJAXBElement(value);
			}

			public String getHoraInicial() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "horaInicial");
				return obterValorDoJAXBElement(value);
			}

			public String getHoraFinal() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "horaFinal");
				return obterValorDoJAXBElement(value);
			}

			public String getDescricaoProcedimento() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(),
						"descricaoProcedimento");
				return obterValorDoJAXBElement(value);
			}

			public String getDataExecutacao() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "dataExecucao");
				return obterValorDoJAXBElement(value);
			}

			public String getCodigoTabela() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(), "codigoTabela");
				return obterValorDoJAXBElement(value);
			}

			public String getCodigoProcedimento() {
				JAXBElement<?> value = getFieldFromListJaxbElementsByName(
						procedimentoExecutadoTemp.getDataExecucaoOrHoraInicialOrHoraFinal(),
						"codigoProcedimento");
				return obterValorDoJAXBElement(value);
			}

			private String obterValorDoJAXBElement(JAXBElement<?> value) {
				return value != null && value.getValue() != null ? value.getValue().toString() : null;
			}
		};
	}

	public JAXBElement<?> getFieldFromListJaxbElementsByName(List<JAXBElement<?>> list, String nome) {
		for (JAXBElement<?> jaxbElement : list) {
			if (jaxbElement.getName().getLocalPart().toString().equals(nome)) {
				return jaxbElement;
			}
		}

		return null;

	}


}
