package mass.converter.service;

public interface MassConverterService {

	//Gram to kg,mg,metric-ton,pound
	
	public double GramToGram(double mass);
	public double GramToKilogram(double mass);
	public double GramToMilligram(double mass);
	public double GramToMetricton(double mass);
	public double GramToPound(double mass);
	
	//Killogram to gram,mg,metric-ton,pound
	
	public double KillogramToKillogram(double mass);
	public double KillogramToGram(double mass);
	public double KillogramToMilligram(double mass);
	public double KillogramToMetricton(double mass);
	public double KillogramToPound(double mass);
	
	//Milligram to gram,kg,metric-ton,pound
	
	public double MilligramToMilligram(double mass);
	public double MilligramToGram(double mass);
	public double MilligramToKillogram(double mass);
	public double MilligramToMetricton(double mass);
	public double MilligramToPound(double mass);
	
	//Metricton to gram,kg,mg,pound
	
	public double MetrictonToMetricton(double mass);
	public double MetrictonToGram(double mass);
	public double MetrictonToKillogram(double mass);
	public double MetrictonToMilligram(double mass);
	public double MetrictonToPound(double mass);
	
	//Pound to gram,kg,mgmmetric-ton,
	
	public double PoundToPound(double mass);
	public double PoundToGram(double mass);
	public double PoundToKillogram(double mass);
	public double PoundToMilligram(double mass);
	public double PoundToMetricton(double mass);
	
	
}
