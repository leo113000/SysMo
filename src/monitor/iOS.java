/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Leo J. Vazquez
 */
public interface iOS extends JsonSerializable
{
  String getFamiliaOS  ();
  String getVersionOS();
  String getFabricanteOS();
}
