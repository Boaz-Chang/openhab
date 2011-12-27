/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2011, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */

package org.openhab.model.sitemap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhab.model.sitemap.SitemapFactory
 * @model kind="package"
 * @generated
 */
public interface SitemapPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sitemap";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openhab.org/model/Sitemap";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sitemap";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SitemapPackage eINSTANCE = org.openhab.model.sitemap.impl.SitemapPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.SitemapModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.SitemapModelImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSitemapModel()
   * @generated
   */
  int SITEMAP_MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.SitemapImpl <em>Sitemap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.SitemapImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSitemap()
   * @generated
   */
  int SITEMAP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP__NAME = SITEMAP_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP__LABEL = SITEMAP_MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP__ICON = SITEMAP_MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP__CHILDREN = SITEMAP_MODEL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Sitemap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITEMAP_FEATURE_COUNT = SITEMAP_MODEL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.WidgetImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__LABEL = 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ICON = 1;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ITEM = 2;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.LinkableWidgetImpl <em>Linkable Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.LinkableWidgetImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getLinkableWidget()
   * @generated
   */
  int LINKABLE_WIDGET = 3;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKABLE_WIDGET__LABEL = WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKABLE_WIDGET__ICON = WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKABLE_WIDGET__ITEM = WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKABLE_WIDGET__CHILDREN = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Linkable Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKABLE_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.FrameImpl <em>Frame</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.FrameImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getFrame()
   * @generated
   */
  int FRAME = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__LABEL = LINKABLE_WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__ICON = LINKABLE_WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__ITEM = LINKABLE_WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__CHILDREN = LINKABLE_WIDGET__CHILDREN;

  /**
   * The number of structural features of the '<em>Frame</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_FEATURE_COUNT = LINKABLE_WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.TextImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getText()
   * @generated
   */
  int TEXT = 5;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__LABEL = LINKABLE_WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__ICON = LINKABLE_WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__ITEM = LINKABLE_WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__CHILDREN = LINKABLE_WIDGET__CHILDREN;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = LINKABLE_WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.GroupImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__LABEL = LINKABLE_WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ICON = LINKABLE_WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ITEM = LINKABLE_WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__CHILDREN = LINKABLE_WIDGET__CHILDREN;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = LINKABLE_WIDGET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.ImageImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 7;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__LABEL = LINKABLE_WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__ICON = LINKABLE_WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__ITEM = LINKABLE_WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CHILDREN = LINKABLE_WIDGET__CHILDREN;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__URL = LINKABLE_WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = LINKABLE_WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.SwitchImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 8;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__LABEL = WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ICON = WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ITEM = WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__MAPPINGS = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.SliderImpl <em>Slider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.SliderImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSlider()
   * @generated
   */
  int SLIDER = 9;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__LABEL = WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__ICON = WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__ITEM = WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__FREQUENCY = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER__SWITCH_ENABLED = WIDGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIDER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.SelectionImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 10;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__LABEL = WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__ICON = WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__ITEM = WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__MAPPINGS = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.ListImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getList()
   * @generated
   */
  int LIST = 11;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__LABEL = WIDGET__LABEL;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__ICON = WIDGET__ICON;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__ITEM = WIDGET__ITEM;

  /**
   * The feature id for the '<em><b>Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__SEPARATOR = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openhab.model.sitemap.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhab.model.sitemap.impl.MappingImpl
   * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 12;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CMD = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__LABEL = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.SitemapModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.openhab.model.sitemap.SitemapModel
   * @generated
   */
  EClass getSitemapModel();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Sitemap <em>Sitemap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sitemap</em>'.
   * @see org.openhab.model.sitemap.Sitemap
   * @generated
   */
  EClass getSitemap();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Sitemap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.openhab.model.sitemap.Sitemap#getName()
   * @see #getSitemap()
   * @generated
   */
  EAttribute getSitemap_Name();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Sitemap#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.openhab.model.sitemap.Sitemap#getLabel()
   * @see #getSitemap()
   * @generated
   */
  EAttribute getSitemap_Label();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Sitemap#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.openhab.model.sitemap.Sitemap#getIcon()
   * @see #getSitemap()
   * @generated
   */
  EAttribute getSitemap_Icon();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.model.sitemap.Sitemap#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.openhab.model.sitemap.Sitemap#getChildren()
   * @see #getSitemap()
   * @generated
   */
  EReference getSitemap_Children();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.openhab.model.sitemap.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Widget#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.openhab.model.sitemap.Widget#getLabel()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Label();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Widget#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.openhab.model.sitemap.Widget#getIcon()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Widget#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item</em>'.
   * @see org.openhab.model.sitemap.Widget#getItem()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Item();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.LinkableWidget <em>Linkable Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linkable Widget</em>'.
   * @see org.openhab.model.sitemap.LinkableWidget
   * @generated
   */
  EClass getLinkableWidget();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.model.sitemap.LinkableWidget#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.openhab.model.sitemap.LinkableWidget#getChildren()
   * @see #getLinkableWidget()
   * @generated
   */
  EReference getLinkableWidget_Children();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Frame <em>Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frame</em>'.
   * @see org.openhab.model.sitemap.Frame
   * @generated
   */
  EClass getFrame();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.openhab.model.sitemap.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.openhab.model.sitemap.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.openhab.model.sitemap.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Image#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.openhab.model.sitemap.Image#getUrl()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Url();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see org.openhab.model.sitemap.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.model.sitemap.Switch#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.openhab.model.sitemap.Switch#getMappings()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Mappings();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Slider <em>Slider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slider</em>'.
   * @see org.openhab.model.sitemap.Slider
   * @generated
   */
  EClass getSlider();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Slider#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.openhab.model.sitemap.Slider#getFrequency()
   * @see #getSlider()
   * @generated
   */
  EAttribute getSlider_Frequency();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Slider#isSwitchEnabled <em>Switch Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Switch Enabled</em>'.
   * @see org.openhab.model.sitemap.Slider#isSwitchEnabled()
   * @see #getSlider()
   * @generated
   */
  EAttribute getSlider_SwitchEnabled();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.openhab.model.sitemap.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for the containment reference list '{@link org.openhab.model.sitemap.Selection#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.openhab.model.sitemap.Selection#getMappings()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_Mappings();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.openhab.model.sitemap.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.List#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separator</em>'.
   * @see org.openhab.model.sitemap.List#getSeparator()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Separator();

  /**
   * Returns the meta object for class '{@link org.openhab.model.sitemap.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.openhab.model.sitemap.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Mapping#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmd</em>'.
   * @see org.openhab.model.sitemap.Mapping#getCmd()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Cmd();

  /**
   * Returns the meta object for the attribute '{@link org.openhab.model.sitemap.Mapping#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.openhab.model.sitemap.Mapping#getLabel()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Label();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SitemapFactory getSitemapFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.SitemapModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.SitemapModelImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSitemapModel()
     * @generated
     */
    EClass SITEMAP_MODEL = eINSTANCE.getSitemapModel();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.SitemapImpl <em>Sitemap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.SitemapImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSitemap()
     * @generated
     */
    EClass SITEMAP = eINSTANCE.getSitemap();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SITEMAP__NAME = eINSTANCE.getSitemap_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SITEMAP__LABEL = eINSTANCE.getSitemap_Label();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SITEMAP__ICON = eINSTANCE.getSitemap_Icon();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITEMAP__CHILDREN = eINSTANCE.getSitemap_Children();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.WidgetImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__LABEL = eINSTANCE.getWidget_Label();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__ICON = eINSTANCE.getWidget_Icon();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__ITEM = eINSTANCE.getWidget_Item();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.LinkableWidgetImpl <em>Linkable Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.LinkableWidgetImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getLinkableWidget()
     * @generated
     */
    EClass LINKABLE_WIDGET = eINSTANCE.getLinkableWidget();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINKABLE_WIDGET__CHILDREN = eINSTANCE.getLinkableWidget_Children();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.FrameImpl <em>Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.FrameImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getFrame()
     * @generated
     */
    EClass FRAME = eINSTANCE.getFrame();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.TextImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.GroupImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.ImageImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.SwitchImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__MAPPINGS = eINSTANCE.getSwitch_Mappings();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.SliderImpl <em>Slider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.SliderImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSlider()
     * @generated
     */
    EClass SLIDER = eINSTANCE.getSlider();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER__FREQUENCY = eINSTANCE.getSlider_Frequency();

    /**
     * The meta object literal for the '<em><b>Switch Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLIDER__SWITCH_ENABLED = eINSTANCE.getSlider_SwitchEnabled();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.SelectionImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__MAPPINGS = eINSTANCE.getSelection_Mappings();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.ListImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__SEPARATOR = eINSTANCE.getList_Separator();

    /**
     * The meta object literal for the '{@link org.openhab.model.sitemap.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhab.model.sitemap.impl.MappingImpl
     * @see org.openhab.model.sitemap.impl.SitemapPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__CMD = eINSTANCE.getMapping_Cmd();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__LABEL = eINSTANCE.getMapping_Label();

  }

} //SitemapPackage