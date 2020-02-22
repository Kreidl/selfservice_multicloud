package com.kienast.aws.util;

import java.util.Comparator;

import com.kienast.aws.models.AWSInstanceType;

public class SortByMemory  implements Comparator<AWSInstanceType> {

	public int compare(AWSInstanceType o1, AWSInstanceType o2) {
        Float change1 = Float.valueOf(o1.getMemory());
        Float change2 = Float.valueOf(o2.getMemory());
        return change1.compareTo(change2);
	}

}
