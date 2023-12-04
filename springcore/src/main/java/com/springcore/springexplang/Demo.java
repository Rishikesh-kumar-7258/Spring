package com.springcore.springexplang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+33}")
	private int x;

	@Value("#{3095 * 56}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private int z;

	@Value("#{T(java.lang.Math).PI}")
	private double e;

	@Value("#{8 > 3}")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", isActive=" + isActive + "]";
	}

}
