/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.getstarted.pizza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
import java.io.Serializable;

@Entity
@Table(name = "order", schema = "pizza")
public class OrderEntity implements Serializable {

  private static  final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true, nullable = false)
  protected Long id; 

  @Column(name = "customer", nullable = false)
  protected String customer;
  @Column(name = "address", nullable = false)
  protected String address;
  @Column(name = "pizza", nullable = false)
  protected String pizza;
  @Column(name = "approved", nullable = false)
  protected boolean approved;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
 
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPizza() {
    return pizza;
  }

  public void setPizza(String pizza) {
    this.pizza = pizza;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }
}
