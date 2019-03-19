package mass.converter.service;

public class MassConverterServiceImpl implements MassConverterService {


	//Gram to kg,mg,metric-ton,pound

	public double GramToGram(double mass) {
		return mass*1;	
	}
	
	public double GramToKilogram(double mass) {
		return mass*0.001;	
	}
	
	public double GramToMilligram(double mass) {
		return mass*1000;	
	}
	
	public double GramToMetricton(double mass) {
		return mass*0.000001;	
	}
	
	public double GramToPound(double mass) {
		return mass*0.0022046244 ;	
	}

	//Killogram to gram,mg,metric-ton,pound
	
	public double KillogramToKillogram(double mass) {
		return mass*1;	
	}
	
	public double KillogramToGram(double mass) {
		return mass*1000;	
	}

	public double KillogramToMilligram(double mass) {
		return mass*1000000;	
	}
	
	public double KillogramToMetricton(double mass) {
		return mass*0.001;	
	}
	
	public double KillogramToPound(double mass) {
		return mass*2.2046244202;	
	}
	
	//Milligram to gram,kg,metric-ton,pound
	
	public double MilligramToMilligram(double mass) {
		return mass*1;	
	}
	
	public double MilligramToGram(double mass) {
		return mass*0.001;	
	}
	
	public double MilligramToKillogram(double mass) {
		return mass*0.000001;	
	}
	
	public double MilligramToMetricton(double mass) {
		return mass*0.000000001;	
	}
	
	public double MilligramToPound(double mass) {
		return mass*0.0000022046;	
	}
	
	//Metricton to gram,kg,mg,pound
	
	public double MetrictonToMetricton(double mass) {
		return mass*1;	
	}
	
	public double MetrictonToGram(double mass) {
		return mass*1000000;	
	}
	
	public double MetrictonToKillogram(double mass) {
		return mass*1000;	
	}
	
	public double MetrictonToMilligram(double mass) {
		return mass*1000000000;	
	}
	
	public double MetrictonToPound(double mass) {
		return mass*2204.6244202;	
	}
	
	//Pound to gram,kg,mgmmetric-ton,
	
	public double PoundToPound(double mass) {
		return mass*1;	
	}
	
	public double PoundToGram(double mass) {
		return mass*453.592;	
	}
	
	public double PoundToKillogram(double mass) {
		return mass*0.453592;	
	}
	
	public double PoundToMilligram(double mass) {
		return mass*453592;	
	}
	
	public double PoundToMetricton(double mass) {
		return mass*0.000453592;	
	}
	
	
}
 