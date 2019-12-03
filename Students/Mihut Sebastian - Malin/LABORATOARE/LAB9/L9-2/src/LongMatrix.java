public class LongMatrix extends GenericMatrix<Long> {
	
	@Override /** Aduna doi long */
	protected Long add(Long o1, Long o2) {
	return o1 + o2;
	}
	 
	@Override /** Inmulteste doi long */
	protected Long multiply(Long o1, Long o2) {
	return o1 * o2;
	}
	 
	@Override /** Specifica zero pentru un long */
	protected Long zero() {
	return (long) 0;
	}
}
