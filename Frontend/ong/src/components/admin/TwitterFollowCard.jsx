import './../styles/app.css';
import PropTypes from 'prop-types';


export function TwitterFollowCard({ username, name, isfollowing }) {

    //const imageSrc = `https://unavatar.io/${username}`;

    return (
        <article className='tw-followCard'>
            <header className='tw-followCard-header'>
                <img 
                    className='tw-followCard-avatar'
                    src="/soyBatman.jpg" 
                    alt="user_avatar"/>
            <div className='tw-followCard-info'>
                <strong>{name}</strong>
                <span className='tw-followCard-infoUsername'>@{username}</span>
            </div>
            </header>

            <aside>
                <button>
                    {isfollowing ? 'Unfollow' : 'Follow'}
                </button>
            </aside>
        </article>
    );

}

TwitterFollowCard.propTypes = {
    username: PropTypes.string.isRequired,
    name: PropTypes.string.isRequired,
    isfollowing: PropTypes.bool.isRequired,
  };


export default TwitterFollowCard;