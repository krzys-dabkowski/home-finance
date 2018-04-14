package ski.dabkow.finance.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;

@MappedSuperclass
@Access(AccessType.FIELD)
// inheritance does not work!!!
// @DynamicUpdate(value = true)
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 4875367053818621096L;

	// will be set by database automatically
	// @NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, insertable = false, updatable = false)
	private Date createdAt;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// will be set by database automatically
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_at", nullable = false, insertable = false, updatable = false)
	private Date modifiedAt;

	protected Date copyDate(Date date) {
		if (date != null) {
			return new Date(date.getTime());
		}

		return null;
	}

	/**
	 *
	 * @return
	 */
	public Date getCreatedAt() {
		return copyDate(createdAt);
	}

	/**
	 *
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 */
	public Date getModifiedAt() {
		return copyDate(modifiedAt);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", getId()).append("createdAt", getCreatedAt())
				.append("modifiedAt", getModifiedAt()).toString();
	}

}
