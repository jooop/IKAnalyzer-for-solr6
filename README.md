# IKAnalyzer-for-solr6

## 说明
由于IKAnalyzer[原文件](https://code.google.com/archive/p/ik-analyzer/downloads)已于2012年停止更新，而后来版本的Lucene依赖包中部分参数修改，并且其无` org.wltea.analyzer.solr.IKTokenizerFactory`类导致无法在solr中启用智能分词服务。因此需要对源文件修改并重新编译。
## 版本
版本依赖为Lucene6.5.1，支持同版本的solr。
## 使用配置
```xml
<!--中文分词器配置-->
<fieldType name="text_ik" class="solr.TextField">
	<!--索引时的分词器-->
	<analyzer type="index">
		<tokenizer class="org.wltea.analyzer.util.IKTokenizerFactory" useSmart="false"/>
		<filter class="solr.LowerCaseFilterFactory" />
	</analyzer>
	<!--查询时的分词器-->
	<analyzer type="query">
		<tokenizer class="org.wltea.analyzer.util.IKTokenizerFactory" useSmart="true"/>
	</analyzer>
</fieldType>
```
## 具体编译和配置信息：[链接](https://jooop.github.io/2017/05/03/solr%E6%9C%8D%E5%8A%A1%E9%85%8D%E7%BD%AE%E5%8F%8A%E7%BC%96%E8%AF%91IKAnalyzer%E9%80%82%E5%BA%94%E7%89%88%E6%9C%AC/)