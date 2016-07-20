//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.16 at 01:00:50 PM BRT 
//


package br.com.glosma.associacao.faturas.hospital.santahelena;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.glosatime1.infra.clazzofxmls.santahelena package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoProcedimento_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "codigoProcedimento");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorUnitario_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "valorUnitario");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoTabela_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "codigoTabela");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDescricaoProcedimento_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "descricaoProcedimento");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraInicial_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "horaInicial");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoUnidadeMedida_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "unidadeMedida");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraFinal_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "horaFinal");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoReducaoAcrescimo_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "reducaoAcrescimo");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoQuantidadeExecutada_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "quantidadeExecutada");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorTotal_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "valorTotal");
    private final static QName _MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDataExecucao_QNAME = new QName("http://www.ans.gov.br/padroes/tiss/schemas", "dataExecucao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.glosatime1.infra.clazzofxmls.santahelena
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML }
     * 
     */
    public ContainerDadosSantaHelenaXML createMensagemTISS() {
        return new ContainerDadosSantaHelenaXML();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora createMensagemTISSPrestadorParaOperadora() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias createMensagemTISSPrestadorParaOperadoraLoteGuias() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISS() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacao() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutados() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.DadosBeneficiario }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.DadosBeneficiario createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoDadosBeneficiario() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.DadosBeneficiario();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ValorTotal }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ValorTotal createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoValorTotal() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ValorTotal();
    }

    /**
     * Create an instance of {@link ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado }
     * 
     */
    public ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutado() {
        return new ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "codigoProcedimento", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Integer> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoProcedimento(Integer value) {
        return new JAXBElement<Integer>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoProcedimento_QNAME, Integer.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valorUnitario", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Float> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorUnitario(Float value) {
        return new JAXBElement<Float>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorUnitario_QNAME, Float.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "codigoTabela", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Byte> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoTabela(Byte value) {
        return new JAXBElement<Byte>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoCodigoTabela_QNAME, Byte.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "descricaoProcedimento", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<String> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDescricaoProcedimento(String value) {
        return new JAXBElement<String>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDescricaoProcedimento_QNAME, String.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "horaInicial", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<XMLGregorianCalendar> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraInicial(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraInicial_QNAME, XMLGregorianCalendar.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "unidadeMedida", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Byte> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoUnidadeMedida(Byte value) {
        return new JAXBElement<Byte>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoUnidadeMedida_QNAME, Byte.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "horaFinal", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<XMLGregorianCalendar> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoHoraFinal_QNAME, XMLGregorianCalendar.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "reducaoAcrescimo", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Float> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoReducaoAcrescimo(Float value) {
        return new JAXBElement<Float>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoReducaoAcrescimo_QNAME, Float.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "quantidadeExecutada", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Byte> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoQuantidadeExecutada(Byte value) {
        return new JAXBElement<Byte>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoQuantidadeExecutada_QNAME, Byte.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "valorTotal", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<Float> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorTotal(Float value) {
        return new JAXBElement<Float>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoValorTotal_QNAME, Float.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ans.gov.br/padroes/tiss/schemas", name = "dataExecucao", scope = ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class)
    public JAXBElement<XMLGregorianCalendar> createMensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDataExecucao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MensagemTISSPrestadorParaOperadoraLoteGuiasGuiasTISSGuiaResumoInternacaoProcedimentosExecutadosProcedimentoExecutadoDataExecucao_QNAME, XMLGregorianCalendar.class, ContainerDadosSantaHelenaXML.PrestadorParaOperadora.LoteGuias.GuiasTISS.GuiaResumoInternacao.ProcedimentosExecutados.ProcedimentoExecutado.class, value);
    }

}