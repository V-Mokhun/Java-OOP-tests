package date;

import java.util.Objects;

public final class ImmutableDate {
	private final int year;
	private final int month;
	private final int day;

	public ImmutableDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	@Override
	public String toString() {
		return String.format("%04d-%02d-%02d", year, month, day);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ImmutableDate that = (ImmutableDate) o;
		return year == that.year && month == that.month && day == that.day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(year, month, day);
	}
}
