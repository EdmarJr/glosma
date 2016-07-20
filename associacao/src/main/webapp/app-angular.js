var app = angular.module('associacao',[]);

app.controller("ControllerPrincipal", function($scope,$http) {
	$http.post("http://localhost:8080/associacao/rest/teste/",{
		urlArquivoHospital:"http://cloud.zgsolucoes.com.br/index.php/s/BsF9vwkW5TZOqY9/download?path=%2FArquivos%20Prestador&files=faturamento_glosamaxx_2016-02-02_161566_3.02.00.xml",
		codigoHospital:1,
		urlConvenioSitePrincipal:"http://glosamaxx.zgsolucoes.com.br/",
		codigoConvenio:1
	}).then(function(success) {
		$scope.resultadosProcedimentos = success.data.resultadoAssociacaoProcedimentos;
	})
});

