package escmga.eyp.wellspecialization.administration.scadacommunication.dataaccess.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.lowagie.text.pdf.hyphenation.TernaryTree.Iterator;

//import cu.uci.dalas.dataaccess.DataAccessException;
//import cu.uci.dalas.dataaccess.dao.GenericDAOImpl;
//import escmga.eyp.wellspecialization.administration.scadacommunication.dataaccess.dao.AlarmDao;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.points.Point;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.Alarm;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.ChangeRateAlarm;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.ComunicationFaultAlarm;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.InstrumentFaultAlarm;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.LevelAlarm;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.LevelAlarm.Level;
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.alarms.NoTimeVariationAlarm;
//
//import escmga.eyp.wellspecialization.administration.scadacommunication.domain.acquisition.communication.Device;
//import escmga.eyp.wellspecialization.common.domain.Well;
//import escmga.eyp.wellspecialization.visualizationcontrol.supervision.domain.presentation.WellGroupAlarmsResponse;

public class AlarmDaoImpl extends GenericDAOImpl<Alarm, Integer> implements
		AlarmDao {

	public long alarmCount() {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT count(e) FROM Alarm e");
		long cant = (Long) query.uniqueResult();
		return cant;
	}

	@SuppressWarnings("unchecked")
	public List<Alarm> readAlarm(int start, int limit, String sort, String dir,
			String filtervalue, String filtercolum) {
		if (sort == null || sort.isEmpty()) {
			sort = "id";
		}
		System.out.println("start " + start + " limit " + limit + " sort "
				+ sort + " dir " + dir);
		Criteria c = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createCriteria(Alarm.class);
		if (dir.equals("ASC")) {
			c.addOrder(Order.asc(sort));
		} else {
			c.addOrder(Order.desc(sort));
		}
		c.setFirstResult(start);
		c.setMaxResults(limit);
		// c.add(Restrictions.like("nombre", "rt%"));

		List<Alarm> result = (List<Alarm>) c.list();
		return result;
	}

	public Alarm readAlarmByDevice(Device device) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM ComunicationFaultAlarm e WHERE e.device = ?");
		query.setParameter(0, device);
		Alarm alarm = (Alarm) query.uniqueResult();
		return alarm;
	}

	public List<Alarm> readAlarmsByPoint(Point point) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT e FROM Alarm e WHERE e.point = ?");
		query.setParameter(0, point);
		return (List<Alarm>) query.list();
	}

	public long alarmCount(Point point) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT count(e) FROM Alarm e WHERE e.point = ?");
		query.setParameter(0, point);
		long cant = (Long) query.uniqueResult();
		return cant;
	}

	public InstrumentFaultAlarm ReadInstrumentFaulAlarm(Point point) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM InstrumentFaultAlarm e WHERE e.point = ?");
		query.setParameter(0, point);
		Object o = query.uniqueResult();
		if (o != null) {
			InstrumentFaultAlarm result = (InstrumentFaultAlarm) query
					.uniqueResult();
			return result;
		}

		return null;
	}

	public NoTimeVariationAlarm ReadNoTimeVariationAlarm(Point point) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM NoTimeVariationAlarm e WHERE e.point = ?");
		query.setParameter(0, point);
		Object o = query.uniqueResult();
		if (o != null) {
			NoTimeVariationAlarm result = (NoTimeVariationAlarm) query
					.uniqueResult();
			return result;
		}

		return null;
	}

	public LevelAlarm ReadLevelAlarm(Point point, Level level) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM LevelAlarm e WHERE e.point = ? and e.level = ?");
		query.setParameter(0, point);
		query.setParameter(1, level);
		Object o = query.uniqueResult();
		if (o != null) {
			LevelAlarm result = (LevelAlarm) query.uniqueResult();
			return result;
		}

		return null;
	}

	public ChangeRateAlarm ReadChangeRateAlarm(Point point) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM ChangeRateAlarm e WHERE e.point = ?");
		query.setParameter(0, point);
		Object o = query.uniqueResult();
		if (o != null) {
			ChangeRateAlarm result = (ChangeRateAlarm) query.uniqueResult();
			return result;
		}

		return null;
	}

	public List<Alarm> readAllByPoint(Point point) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT e FROM Alarm e WHERE e.point = ?");
		query.setParameter(0, point);
		List<Alarm> o = query.list();
		if (o != null) {
			return o;
		}

		return null;
	}

	public ComunicationFaultAlarm ReadComunicationFaulAlarm(Device device) {
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"SELECT e FROM ComunicationFaultAlarm e WHERE e.device = ?");
		query.setParameter(0, device);
		Object o = query.uniqueResult();
		if (o != null) {
			ComunicationFaultAlarm result = (ComunicationFaultAlarm) query
					.uniqueResult();
			return result;
		}

		return null;
	}

	@Override
	public Alarm readAlarmById(int id) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT e FROM Alarm e WHERE e.id = ?");
		query.setParameter(0, id);
		Alarm alarm = (Alarm) query.uniqueResult();
		return alarm;
	}

	@Override
	public List<LevelAlarm> readEnabledLevelAlarms(int poinId) {			
	
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT e FROM LevelAlarm e WHERE e.point.id = ? AND e.enabled = ?");//LevelAlarm.id AND Alarm.point.id = ? AND Alarm.enabled = ?
		query.setParameter(0, poinId);
		query.setParameter(1, true);

		Object o = query.list();
		if (o != null) {
			List<LevelAlarm> result = (List<LevelAlarm>) query.list();
			return result;
		}

		return null;
	}
	
	@Override
	public ArrayList<WellGroupAlarmsResponse> readEnabledListLevelAlarms(HashMap<Integer, WellGroupAlarmsResponse> points) {			
	
		HashMap hm = new HashMap();
		java.util.Iterator it = points.entrySet().iterator();
		ArrayList<Integer> listPoint = new ArrayList<Integer>();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			//System.out.println(e.getKey() + " " + e.getValue());
			listPoint.add((Integer) e.getKey());
			}
		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery("SELECT e FROM LevelAlarm e WHERE e.point.id IN (:listPoint) AND e.enabled = true");//LevelAlarm.id AND Alarm.point.id = ? AND Alarm.enabled = ?
		query.setParameterList("listPoint", listPoint);
		//query.setParameter(1, true);

		//ArrayList<Object> o = (ArrayList<Object>) query.list();
		List<LevelAlarm> result = (List<LevelAlarm>) query.list();
		//HashMap<String, LevelAlarm> res = new HashMap<String, LevelAlarm>();
		ArrayList<WellGroupAlarmsResponse> ff = new ArrayList<WellGroupAlarmsResponse>();
		if (result != null) {
			for (int i = 0; i < result.size(); i++) {
				LevelAlarm item = (LevelAlarm) result.get(i);
				//Integer pointId = item.getPoint().getId();
				//WellGroupAlarmsResponse alar = points.get(pointId);
				WellGroupAlarmsResponse wellp =  points.get(item.getPoint().getId());
				//WellGroupAlarmsResponse prueba = new WellGroupAlarmsResponse();
				//prueba.setWellName(wellp.getWellName());
				//prueba.setColumnId(wellp.getColumnId());
				Integer ind = ff.indexOf(wellp);
				if (ind == -1){
					
					wellp.getListLevelAlarms().add(item);
					ff.add(wellp);
					
				}
				else{
					WellGroupAlarmsResponse element = ff.get(ind);
					element.getListLevelAlarms().add(item);
				}
				
//				if (well.getListLevelAlarms()==null){
//					ArrayList<LevelAlarm> listA = new ArrayList<LevelAlarm>();
//					prueba.setListLevelAlarms(listA);
//					
//				}
				
				
				
				
				//res.put(well, item);
				//System.out.println(item.getPoint().getId());
			}
			//List<LevelAlarm> result = (List<LevelAlarm>) query.list();
			//System.out.println();
			return ff;
		}

		return null;
	}

	@Override
	public void updateAlarmedState(Alarm alarm) {
//		Session session = getHibernateTemplate()
//				.getSessionFactory()
//				.getCurrentSession();
//		Transaction tx = session.beginTransaction();
//
//		String hqlUpdate = "update Alarm c set c.id = :newName where c.name = :oldName";
//		// or String hqlUpdate = "update Customer set name = :newName where name = :oldName";
//		int updatedEntities = session.createQuery( hqlUpdate )
//		        .setString( "id", alarm.getId() )
//		        .setString( "oldName", oldName )
//		        .executeUpdate();
//		tx.commit();
//		session.close();
		Alarm objectToUpdate = (Alarm) getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession().get(Alarm.class, alarm.getId());
		objectToUpdate.setAlarmed(alarm.getAlarmed());
	try {
		this.merge(objectToUpdate);
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public HashMap<Integer, List<LevelAlarm>> readEnabledLevelAlarms() {
		Criteria c = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createCriteria(LevelAlarm.class);
		c.add(Restrictions.eq("enabled", true));
		
		List<LevelAlarm> Alarms=c.list();
		if(Alarms==null)
			return null;
		HashMap<Integer, List<LevelAlarm>> map = new HashMap<Integer, List<LevelAlarm>>();
		List<LevelAlarm> temp=new ArrayList<LevelAlarm>();
		for (LevelAlarm levelAlarm : Alarms) {
			
			if(map.get(levelAlarm.getPoint().getId())==null){
				temp.add(levelAlarm) ;
				map.put(levelAlarm.getPoint().getId(), new ArrayList<LevelAlarm>(temp));
				
			}
			else
			{
				temp=map.get(levelAlarm.getPoint().getId());
				temp.add(levelAlarm);
				map.put(levelAlarm.getPoint().getId(),new ArrayList<LevelAlarm>(temp));
			}
			temp.clear();
//			System.out.println("point "+levelAlarm.getPoint().getId()+", alarms: "+temp.get(0).getId()+" "+temp.get(1).getId()+" "+temp.get(2).getId()+" "+temp.get(3).getId());
		}
		
		if(map.size()==0)
			return null;
		return map;
	}

}
